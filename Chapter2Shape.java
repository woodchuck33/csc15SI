public class Chapter2Shape
{
    public static void main(String[] args)
    {
        for (int line = 1; line <=5; line++)
        {
            for (int space = 5-line; space >=1; space--)
            {
                System.out.println (" ");
            }
            for (int num = line; num <=line; num++)
            {
                System.out.println(num);
            }
        }
    }
}
