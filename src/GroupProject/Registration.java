package GroupProject;

import java.util.Locale;

    public class Registration {
        private String email;
        private String userName;
        private String password;

        String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            if (userName.length() < 6) {
                System.out.println("Your user name cannot be empty or shorter then 6 characters");
            } else {
                this.userName = userName;
            }
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            if (email.contains("yahoo")) {
                this.email = email;
            } else {
                System.out.println("Your email should be yahoo");
            }
        }

        public String getPassword() {

            return password;

        }

        public void setPassword(String password, String userName) {

            if (password.length() < 6) {
                System.out.println("Your password cannot be empty or shorter then 6 characters");
            } else if (password.contains(userName)) {
                System.out.println("Your password cannot contain username");
            } else {
                this.password = password;
            }
        }
    }

