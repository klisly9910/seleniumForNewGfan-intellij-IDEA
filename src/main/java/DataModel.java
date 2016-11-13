/**
 * Created by klisly on 12/11/2016.
 */
public class DataModel {

    /**
     * phone : //*[@id="nav-top"]/div[2]/ul/li[1]/a
     * computer : .//*[@id="nav-top"]/div[2]/ul/li[2]/a
     * smart : .//*[@id="nav-top"]/div[2]/ul/li[3]/a
     * homeElectric : .//*[@id="nav-top"]/div[2]/ul/li[4]/a
     * office : .//*[@id="nav-top"]/div[2]/ul/li[5]/a
     * game : .//*[@id="nav-top"]/div[2]/ul/li[6]/a
     * bbs : .//*[@id="nav-top"]/div[2]/ul/li[7]/a
     * newMedia : .//*[@id="nav-top"]/div[2]/ul/li[8]/a
     * logo:/html/body/div[2]/div/a/img
     */

    private NavigatorBean navigator;
    /**
     * notexit : /html/body/pre
     */

    private ErrorMessageBean errorMessage;
    /**
     * logo : /html/body/div[5]/div/div[1]/strong/a
     * footertop : /html/body/div[5]/div/div[1]/ul[1]/li/a
     */

    private FooterBean footer;

    /**
     * id : //*[@id="kw"]
     * button : //*[@id="su"]
     */


    public NavigatorBean getNavigator() {
        return navigator;
    }

    public void setNavigator(NavigatorBean navigator) {
        this.navigator = navigator;
    }

    public ErrorMessageBean getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessageBean errorMessage) {
        this.errorMessage = errorMessage;
    }

    public FooterBean getFooter() {
        return footer;
    }

    public void setFooter(FooterBean footer) {
        this.footer = footer;
    }

    public static class NavigatorBean {
        private String phone;
        private String computer;
        private String smart;
        private String homeElectric;
        private String office;
        private String game;
        private String bbs;
        private String newMedia;
        private String logo;


        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getComputer() {
            return computer;
        }

        public void setComputer(String computer) {
            this.computer = computer;
        }

        public String getSmart() {
            return smart;
        }

        public void setSmart(String smart) {
            this.smart = smart;
        }

        public String getHomeElectric() {
            return homeElectric;
        }

        public void setHomeElectric(String homeElectric) {
            this.homeElectric = homeElectric;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public String getGame() {
            return game;
        }

        public void setGame(String game) {
            this.game = game;
        }

        public String getBbs() {
            return bbs;
        }

        public void setBbs(String bbs) {
            this.bbs = bbs;
        }

        public String getNewMedia() {
            return newMedia;
        }

        public void setNewMedia(String newMedia) {
            this.newMedia = newMedia;
        }
    }

    public static class ErrorMessageBean {
        private String notexit;

        public String getNotexit() {
            return notexit;
        }

        public void setNotexit(String notexit) {
            this.notexit = notexit;
        }
    }


    public static class FooterBean {
        private String footerlogo;
        private String footertop;

        public String getFooterlogo() {
            return footerlogo;
        }

        public void setFooterlogo(String logo) {
            this.footerlogo = footertop;
        }

        public String getFootertop() {
            return footertop;
        }

        public void setFootertop(String footertop) {
            this.footertop = footertop;
        }
    }
}
