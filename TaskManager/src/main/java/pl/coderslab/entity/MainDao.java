package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = new User();

//        user.setEmail("wddwadaw22fra");
//        user.setUserName("Olgierd");
//        user.setPassword("ołsaH");
//        user.setId(10);
//        userDao.update(user);
        User read = userDao.read(10);
        System.out.println(read);
//        userDao.delete(10);
        User[] users = userDao.findAll();
        for (User u : users) {
            System.out.println(u.getId()+" "+u.getUserName()+" "+u.getEmail()+" "+u.getPassword());
        }
    }
}
