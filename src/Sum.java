/**
 * 使用方法的递归实现计算连加功能
 */
public class Sum {
    /*计算 1+2+3+4+5+……+n */
    public int sum(int n){
        if(n>=1){
            return n+sum(n-1);
        }
        return 0;
    }

    /*计算 1+3+5+……+n */
    public int sum1(int n){
        if(n>=1){
            return n+sum1(n-2);
        }
        return 0;
    }

    /*计算 1+2+4+8+16+……+2^n */
    public int multisum(int n){
        if(n>=0){
            return (int)(Math.pow(2,n)+multisum(n-1));
        }
        return 0;
    }
}
