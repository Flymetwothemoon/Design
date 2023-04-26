package EasyBuild;

public class UserInfo {
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    private String info;
    public UserInfo(Builder builder){
        this.info = builder.info;
    }
    static class Builder{
        private String info;
        public Builder info(String info){
            this.info = info;
            return this;
        }
        public UserInfo build(){
            return new UserInfo(this);
        }
    }

}
