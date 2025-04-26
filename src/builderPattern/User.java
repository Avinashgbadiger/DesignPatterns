package builderPattern;

public class User {

    private String userId;
    private String name;
    private String email;

    private User(UserBuilder userBuilder) {
        this.email = userBuilder.email;
        this.userId = userBuilder.userId;
        this.name = userBuilder.name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    static UserBuilder builder()
    {
        return new UserBuilder();
    }



    //Inner class to create Object
    static class UserBuilder {
        public UserBuilder() {

        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "userId='" + userId + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

        private String userId;
        private String name;
        private String email;

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
