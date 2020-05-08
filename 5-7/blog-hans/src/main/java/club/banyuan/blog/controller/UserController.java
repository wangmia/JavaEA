package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import club.banyuan.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user/{username:[a-z0-9_]+}")
public class UserController {
    @GetMapping
    @ResponseBody
    public List<Blog> users(@RequestParam(name="page",required=false,defaultValue="1") Integer page ,@RequestParam(name="size",required=false, defaultValue="10") Integer size, @PathVariable String username) {
        User user = new UserService().findByName("zhangsan");
        List list = new BlogService().findBlogs(user);
        List list1 = new ArrayList();

//        小于边界范围，返回第一页
        if(page<=0||size<=0){
            if(size>0&&size<list.size()){
                page = 1;
                list1 = pages(page,size,list);
            }else{
                list1.add("size必须大于0且不能大于100");
            }
            return list1;
        }

//        都在范围内，正常输出
        list1 = pages(page,size,list);

//        超出边界范围，返回最后一页
        if(list1.size()==0){
            int number ;
            if(list.size()%size==0){
                number = list.size()/size;
            }else{
                number = list.size()/size+1;
            }
            page = number;
            list1 = pages(page,size,list);
        }
        return list1;
    }

//    计算分页的算法
    public List pages(Integer pages,Integer size,List list){
        List list2 = new ArrayList();
        for(int i=0;i<size;i++){
            if(pages*size-size+i>=list.size()){
                break;
            }else{
                list2.add(list.get(pages*size-size+i));
            }
        }
        return list2;
    }
}
