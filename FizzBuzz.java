class FizzBuzz {
    public static void main(String[] args) {

        int param = Integer.parseInt(args[0]);

        for (int i = 1; i < param + 1; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuss");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
