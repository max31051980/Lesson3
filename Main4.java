public class Main4 {
    public static void main(String[] args) {
        int randomNumber = 10 + (int) (Math.random()*1000);
        System.out.println("Your random Number " + randomNumber);
        String str = Integer.toString(randomNumber);
        boolean test = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i + 1) <= str.charAt(i))) {
                test = true;
                break;
            }
        }
        if (test)
            System.out.println("The digits of the number " + randomNumber + " don't form increasing sequence");
        else
            System.out.println("The digits of the number " + randomNumber + " form increasing sequence");
    }
}