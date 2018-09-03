public class Vowel1
{

    public static void main(String[] args) 
{

        char ch = 'a';

        switch (ch)
 {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");r
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
