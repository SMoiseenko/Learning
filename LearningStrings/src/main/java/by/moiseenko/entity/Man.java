package by.moiseenko.entity;

public class Man {
    private String name;
    private String password;
    private String hexValue;
    private String slug;
    private String eMail;
    private String url;
    private String ipAddress;
    private String htmlTag;

    public Man() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIpAdress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setHtmlTag(String htmlTag) {
        this.htmlTag = htmlTag;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", hexValue='" + hexValue + '\'' +
                ", slug='" + slug + '\'' +
                ", eMail='" + eMail + '\'' +
                ", url='" + url + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", htmlTag='" + htmlTag + '\'' +
                '}';
    }
}
