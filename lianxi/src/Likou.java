import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
            System.out.println(i);
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

}
