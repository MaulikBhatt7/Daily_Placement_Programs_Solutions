public class D12_Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        String[] arr = s.split(" ");
        s = String.join("", arr);
        System.out.println(s);
        int i = 0;
        int j = s.length() - 1;
        int flag = 0;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if (flag == 1) {
            System.out.println("not palindrom");
        } else {
            System.out.println("palindrom");
        }
    }
}
