package builderPattern;

public interface TestingBuilderPattern {
    public static void main(String[] args) {

        User build = new User.UserBuilder()
                .setUserId("Avinash123")
                .setEmail("avinash@gmail.com")
                .setName("Avinash")
                .build();
        System.out.println("------------");

        System.out.println(build.toString());

        System.out.println("----------");

        User build1 = User.builder().setName("avinash").setEmail("avianash@gmail.com").setUserId("User1312").build();
        System.out.println(build1);

    }
}
