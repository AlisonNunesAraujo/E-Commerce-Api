package spring_boot.para.portifolio.model;


import jakarta.persistence.*;

@Table(name = "banners")
@Entity(name = "banners")
public class BannerModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;

    public BannerModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BannerModel(Long id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
    }
}
