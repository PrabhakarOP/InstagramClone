import Instagram.controller.InstagramController;

public class UiClient{
    public static void main(String[] args){
        InstagramController ig=new InstagramController();

        ig.signup("satyam","1234","7766946640","satyamYadav@rjd.com");
        ig.signup("prabhakar","12345","9798825716","playhorn.pp@gmail.com");
        ig.signup("anushka","123456","1234567890","anushka123@gmail.com");
        ig.signup("ananya","1234567","9153703611","ananya74623@gmail.com");
        ig.signup("alok","12345678","7903686067","yuviyuvrajy9@gmail.com");

        ig.signin("satyam","1234");
        ig.signin("prabhakar","12345");

        ig.updateBio("satyam","Kattar RJD Fan");
        ig.showBio("satyam");

    }
}