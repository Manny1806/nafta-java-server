package models;

import org.springframework.data.annotation.Id;

public class Pro {
    @Id private String id;

    private String title;
    private String quote;
    private String quoteRef;
    private String quoteLink;
    private String description;
    private String type;
    private String imgLink;

    public String getTitle(){
        return title;
    }
     public void setTitle(String title){
         this.title = title;
    }

    public String getQuote(){
        return quote;
    }
     public void setQuote(String quote){
         this.quote = quote;
    }

    public String getQuoteRef(){
        return quoteRef;
    }
     public void setQuoteRef(String quoteRef){
         this.quoteRef = quoteRef;
    }

    public String getQuoteLink(){
        return quoteLink;
    }
     public void setQuoteLink(String quoteLink){
         this.quoteLink = quoteLink;
    }

    public String getDescription(){
        return description;
    }
     public void setDescription(String description){
         this.description = description;
    }

    public String getType(){
        return type;
    }
     public void setType(String type){
         this.type = type;
    }

    public String getImgLink(){
        return imgLink;
    }
     public void setImgLink(String imgLink){
         this.imgLink = imgLink;
    }
}