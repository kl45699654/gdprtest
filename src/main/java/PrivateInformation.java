/**
 * @program: gdprtest
 * @description: 个人用户的bean
 * @author: Mr.Shu
 * @create: 2018-07-19 11:03
 **/
public class PrivateInformation {


    private String  NAME;
    private int ID;
    private int TLE;
    PrivateInformation(){}
    public PrivateInformation(String name,int id,int tle){
        NAME=name;
        ID= id;
        TLE =tle;
    }
        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getTLE() {
            return TLE;
        }

        public void setTLE(int TLE) {
            this.TLE = TLE;
        }

}
