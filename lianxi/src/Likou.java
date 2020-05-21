import javax.swing.text.TabableView;
import java.util.*;

public class Likou {

    // 回文数
    public boolean isPalindrome(int x) {
        int number = x;
        int d_x = 0;
//        把数字倒序
        while(number>0){
            d_x = d_x*10 + number % 10;
            number = number / 10;
        }
//        比较倒序后的数字
        if(d_x!=x){
            return false;
        }else{
            return true;
        }
    }

    // 括号
    public boolean kuo(String str){
        char [] stt = {'{','[','(','}',']',')'};
        char [] sts = str.toCharArray();
        for(int i=0;i<sts.length;i=i+2){
            if(sts[i]==' '){
                continue;
            }
//            System.out.println(i);
            for(int j=0;j<3;j++){
                if(sts[j]==stt[j]){
                    if(sts[j+1]!=stt[j+3]&&(sts[j+1]!=' '&&sts[j+2]!=stt[j+3])){
                        return false;
                 }
                }
            }
        }
        return true;
    }

//   返回删除元素后的数组的个数
    public int shu(int number[],int val){
        int k=0;
        for (int i=0;i<number.length;i++){
            if(number[i]==val){
                    number[i]=0;
                k++;
            }
        }
        return k;
    }

//    种花
    public boolean hua(int number[],int n){
        if(n<0||n>number.length||number.length>20000){
            return  false;
        }
        for (int i=0;i<number.length-1;i++){
            if(number[i]==0&&number[i+1]!=1){
                if(i!=number.length-2){
                    if(number[i+2]!=1||i+1==number.length-2){
                        number[i+1]=1;
                        n--;
                    }
                }else{
                    n--;
                }
                i=i+2;
            }
        }
        if(n<=0){
            return true;
        }else {
            return false;
        }
    }

//    供暖期
    public int gong(int[] houses, int[] heaters){
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        for (int house : houses) {
            while (i < heaters.length && heaters[i] < house) {
                i++;
            }
            if (i == 0) {
                radius = Math.max(radius, heaters[i] - house);
            }else if (i == heaters.length) {
                return Math.max(radius, houses[houses.length - 1] - heaters[heaters.length - 1]);
            }else {
                radius = Math.max(radius, Math.min(heaters[i] - house, house - heaters[i - 1]));
            }
        }
        return radius;
    }

//    截取字符串
    public String reverseLeftWords(String s, int n) {
        s = s.substring(n)+s.substring(0,n);
        return s;
    }

//    亲密字符串
    public boolean buddyStrings(String A, String B) {

        if((A.length()<=0||A.length()>20000)||(B.length()<=0||B.length()>20000)){
            return false;
        }

        Set<Character> set = new HashSet<>();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        char tmp;
        int index = -1;
        for(int i = 0; i < A.length(); i ++){
            set.add(a[i]);
            if(a[i] != b[i]) {
                if (index == -1) {
                    index = i;
                } else {
                    tmp = a[index];
                    a[index] = a[i];
                    a[i] = tmp;
                    if (B.equals(new String(a))) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        if(index == -1 && set.size() < A.length()){
            return true;
        }

        return false;
    }

//    截取字符串返回最后的长度
    public int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        if(s.equals("")||str.length<=0){
            return 0;
        }else{
            return str[str.length-1].length();
        }
    }

    //  非递减数列
    public boolean checkPossibility(int[] nums) {
        int count=0,temp=0;
        for(int i=0;i<nums.length-1;i++){
            //出现不满足非递减的情况
            if(nums[i]>nums[i+1]){
                //第二次出现非递减时直接返回false
                if(count++>0){
                    return false;
                }
                if(nums[i+1]<temp){
                    nums[i+1]=nums[i];
                }else{
                    nums[i]=temp;
                }
            }
            temp=nums[i];
        }
        return true;
    }

//    只出现一次的数字
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        int number = 0;
        set.add(nums[0]);
        for (int i=1;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else {
                set.remove(nums[i]);
            }
        }
        for (int i:set) {
            number = i;
        }
        return number;
    }

//    平方数之和
    public boolean judgeSquareSum(int c) {
        for (int a = 0;a<=(int)Math.sqrt(c);a++){
            // q 是b的平方
            int q = c-a*a;
            double b = Math.sqrt(q);
            if(b==(int)b){
                return true;
            }
        }
        return false;
    }

//  上升下降字符串
    public String sortString(String s) {
        String s1 = "";
        char n[] = s.toCharArray();
        char min = n[0];
        char max = n[0];
        int c = s.length();
        for (int i=1;i<s.length();i++){
            if(min>n[i]){
                min = n[i];
            }
            if(max<n[i]){
                max = n[i];
            }
        }
        for (int j=0;j<c;j++){
            for (int i=0;i<s.length();i++){
                if(min)
            }
        }


        return "";
    }
}