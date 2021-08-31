public class AccountExampleTest {
    public static final String[] validateAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] invalidateAccount = new String[]{".@", "12345", "1234_", "abcde"};
    private static int count = 1;

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validateAccount) {
            System.out.println(count + ": " + account);
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
            count++;
        }
        System.out.println("--------------------------------");
        for (String account : invalidateAccount) {
            System.out.println(count + ": " + account);
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
            count++;
        }
    }
}
