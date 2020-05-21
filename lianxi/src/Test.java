import java.util.HashSet;
import java.util.Set;

class Test {
    public static void main(String[] args) {
        Likou likou = new Likou();
        int number[] = {1,0,0,0,1,0,0};
//        int number1[] = {1,2,3,4,5};
//        int number1[] = {-1,4,2,3};  // 递减
        int number1[] = {4,1,2,1,2};
        int number2[] = {2,4};
        int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(likou.isPalindrome(122521));
//        System.out.println(likou.kuo("{ }"));
//        System.out.println(likou.shu(number,2));
//        System.out.println(likou.hua(number,2));
//        System.out.println(likou.gong(number1,number2));
//        System.out.println(likou.reverseLeftWords("lrloseumgh",6));
//        System.out.println(likou.buddyStrings("abab","abab"));
//        System.out.println(likou.lengthOfLastWord(" "));
//        System.out.println(likou.checkPossibility(number1));
//        System.out.println(likou.singleNumber(number1));
//        System.out.println(likou.judgeSquareSum(5));
//        System.out.println(num[0].length);
        System.out.println(likou.sortString("aaaabbbbcccc"));
    }
}
    /*          Sql 题
    1.编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。字段有id,Emalil
    select Email from Person group by Email having count(id)>1
    2. 大国家
    select name,population,area from World where area>3000000 or population>25000000
     */