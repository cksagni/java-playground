package streams;

public class User implements Comparable<User>{
    private String name;
    private int likes;

    public User(String name, int likes, UserType userType) {
        this.name = name;
        this.likes = likes;
        this.userType = userType;
    }

    private UserType userType;

    public User(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", likes=" + likes +
                '}';
    }

    public UserType getGenre() {
        return userType;
    }
}
