
public class PhoneNum {
    public static void main(String[] args) {
        String ans = getPhoneNumber("five one zero six triple eight nine six four");
        System.out.println(ans);
    }

    public static String getPhoneNumber(String s) {
        String[] text = s.split(" ");
        String phoneNum = "";

        for (int i = 0; i < text.length; i++) {

            if (text[i].equals("double")) {
                String singleNum = checkNum(text[i + 1]);
                phoneNum = phoneNum + singleNum;
            } else if (text[i].equals("tripple")) {
                String singleNum = checkNum(text[i + 1]);
                phoneNum = phoneNum + singleNum + singleNum;
            } else {
                String singleNum = checkNum(text[i]);
                phoneNum = phoneNum + singleNum;

            }

        }

        return phoneNum;
    }

    public static String checkNum(String numStr) {
        if (numStr.equals("one")) {
            return "1";
        }

        if (numStr.equals("two")) {
            return "2";
        }
        if (numStr.equals("three")) {
            return "3";
        }
        if (numStr.equals("four")) {
            return "4";
        }
        if (numStr.equals("five")) {
            return "5";
        }
        if (numStr.equals("six")) {
            return "6";
        }
        if (numStr.equals("seven")) {
            return "7";
        }
        if (numStr.equals("eight")) {
            return "8";
        }
        if (numStr.equals("nine")) {
            return "9";
        }
        if (numStr.equals("zero")) {
            return "0";
        }

        return "";
    }
}
