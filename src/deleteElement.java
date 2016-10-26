/**
 * 给定一串字符串 “We are so happy. We have many apples and fishes to eat.”
 * 写一个方法把字符串中的h去掉，返回新的字符串
 */
public class deleteElement {
    public static String deleteElement(String str, char key){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != key)
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }

 /* public static void main(String args[]){
        String str ="We are so happy. We have many apples and fishes to eat.";
        System.out.println(deleteElement(str,'h'));
  }*/
}
