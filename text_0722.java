public class text_0722 {
    public static void main(String[] args) {
        /* string获取功能 */
        //lastIndexOf()----------------------------获取此字符在字符串中的最后一个位置的索引
        //length()---------------------------------获取字符串的长度，其实也就是字符个数
        //charAt(int index)------------------------获取指定索引处的字符
        //indexOf(String str)----------------------获取str在字符串对象中第一次出现的索引
        //substring(int start)---------------------从start开始截取字符串
        //String substring(int start,int end)------从start开始，到end结束截取字符串。包括start，不包括end

        /* string判断功能*/
        //equals(Object obj)-----------------------比较字符串的内容是否相同
        //equalsIgnoreCase(String anotherString)---比较字符串的内容是否相同,忽略大小写
        //startsWith(String prefix)----------------判断字符串对象是否以指定的字符开头（区分大小写）
        //startsWith(String prefix,int toffset)----判断字符串对象是否以指定的字符开头，参数toffset为指定从哪个下标开始
        //endsWith(String str)---------------------判断字符串对象是否以指定的字符结尾-----返回布尔值

                            /* string类中的转换方法 */
        //toCharArray()----------------------------把字符串转换为字符数组
        //toLowerCase()----------------------------把字符串转换为小写字符串
        //toUpperCase()----------------------------把字符串转换为大写字符串
        //trim()-----------------------------------去除字符串两端空格
        //split()----------------------------------去除字符串中指定的的字符，然后返回一个新的字符串
        //subSequence(int beginIndex,int endIndex)---截取字符串中指定位置的字符组成一个新的字符串----包括前不包括后

        // replace(char oldChar, char newChar)----将指定字符替换成另一个指定的字符
        // replaceAll(String regex,String replasement)----用新的内容替换全部旧内容
        /* replace与replaceAII的异同
        * 同：都是将字符或者字符串全部替换
        * 异：replaceAII支持正则表达式
        */


        // replaceFirst(String regex,String replacement)---替换首个满足条件的内容
        // lastIndexOf(String str)---返回指定字符出现的最后一次的下标
        // contains(CharSequence s)---查看字符串中是都含有指定字符-----返回布尔值
        // concat(String str)----在原有的字符串的基础上加上指定字符串

        //compareTo()------------按照字典顺序进行比较，逐位比较，相同返回0，不同返回负数。
        String str = new String("114.128.15.9");
        String [] div = str.split("\\.");
        for (String a : div) {
            System.out.print("[" + a + "]");
        }
    }
}
