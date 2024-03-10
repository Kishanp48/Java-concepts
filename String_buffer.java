public class String_buffer
{
    public static void main(String[] args)
    {
        // String buffer is Thread safe
        // StringBuffer has buffer space for 16 characters.
        
        StringBuffer sb = new StringBuffer("Kishan");
        System.out.println(sb.capacity());  // .capacity() - use to get capacity.
        System.out.println(sb.length());    // .length() - use to get length.

        sb.append(" Panchal");  //Concatenate String in Same variable/value.
        //
        System.out.println(sb);

        String str = sb.toString(); //Convert StringBuffer to string.
        System.out.println(str);


        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(6,"JAVA ");
        System.out.println(sb);

        sb.setLength(30);
        System.out.println(sb);

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

    }
}
