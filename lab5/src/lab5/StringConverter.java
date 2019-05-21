package lab5;
public class StringConverter
{
    public StringConverter(String input)
    {
        for(int i=0;i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i))==true)
            {
                if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'||input.charAt(i)=='Y'||input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='y')
                    System.out.print(Character.toLowerCase(input.charAt(i)));
                else
                    System.out.print(Character.toUpperCase(input.charAt(i)));
            }
            else
                System.out.print("*");
        }
        System.out.println("");
        
    }
    
    public static void main(String[] args)
    {
        StringConverter myConverter=new StringConverter(args[0]);
    }




}