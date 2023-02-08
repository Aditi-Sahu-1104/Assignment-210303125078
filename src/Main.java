public class main{
    public static void main(string[]args){

        String s1="ADITI";
        String s2="aadi";
        String s3="aditi";
        String s4="Satarupa";
        String s5="I have a lot to say";
        String s6="";
        char c1=s1.charAt(4);
        System.out.println("character at 4 "+c1);
        System.out.println("string comparision:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println("concatenation:");
        s3=s3.concat(" is great");
        System.out.println(s3);
        System.out.println("String contains: ");
        System.out.println(s5.contains("a lot"));
        System.out.println("ends with: ");
        System.out.println(s5.endsWith("say"));
        System.out.println("equals: ");
        System.out.println(s1.equals(s3));
        System.out.println("equals ignore: ");
        System.out.println(s1.equalsIgnoreCase(s3));
        s6=String.format("name is %s ",s2);
        System.out.println(s6);
        String s7="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
        String str = new String("hello aditi, how r u");
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
        String s8="this is index of example";
        int index1=s8.indexOf("is");
        int index2=s8.indexOf("index");
        System.out.println(index1+"  "+index2);
        int index3=s8.indexOf("is",4);
        System.out.println(index3);
        int index4=s8.indexOf('s');
        System.out.println(index4);
        String s9=new String("hello");
        String s10="hello";
        String s11=s1.intern();
        System.out.println(s9==s10);
        System.out.println(s10==s11);
        String s12="";
        String s13="aditi";
        System.out.println(s12.isEmpty());
        System.out.println(s13.isEmpty());
        String joinString14=String.join("-","welcome","to","PU");
        System.out.println(joinString14);
        String s15="this is index of example";
        int index5=s15.lastIndexOf('s')
        System.out.println(index1);
        String s16 = "This is index of example";
        int index = s16.lastIndexOf('s',5);
        System.out.println(index);
        String s17 = "This is last index of example";
        int index6 = str.lastIndexOf("of");
        System.out.println(index6);
        String s18 = "This is last index of example";
        int index7 = str.lastIndexOf("of", 25);
        System.out.println(index7);
        index7 = str.lastIndexOf("of", 10);
        System.out.println(index7);
        String s19="java";
        String s20="python";
        System.out.println("string length is: "+s19.length());
        System.out.println("string length is: "+s20.length());
        String s21="have a good day";
        String replaceString=s21.replace('a','e');
        System.out.println(replaceString);
        String s22="have a nice day";
        String replaceString1=s22.replaceAll("a","e");
        System.out.println(replaceString1);
        String s23="java string split method ";
        String[] words=s23.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        String s24="java string  ";
        System.out.println(s24.startsWith("ja"));
        System.out.println(s24.startsWith("java string"));
        System.out.println(s1.startsWith("Java string"));
        String s25="java";
        System.out.println(s25.substring(2,4));
        String s26="hello";
        char[] ch1=s26.toCharArray();
        for(int i=0;i<ch1.length;i++){
            System.out.print(ch[i]);
        }
        String s27="JAVA";
        String s27lower=s27.toLowerCase();
        System.out.println(s27lower);
        String s28="hello string";
        String s28upper=s28.toUpperCase();
        System.out.println(s28upper);
        String s29="  hello string   ";
        System.out.println(s29+"java");
        System.out.println(s29.trim()+"java");
        int value=30;
        String s30=String.valueOf(value);
        System.out.println(s30+10);
    }

