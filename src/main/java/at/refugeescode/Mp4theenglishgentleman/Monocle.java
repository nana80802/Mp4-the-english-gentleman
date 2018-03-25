package at.refugeescode.Mp4theenglishgentleman;

import org.springframework.stereotype.Component;

@Component
public class Monocle {
    private NewsPaper newsPaper;

    public Monocle(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
    }

    public NewsPaper see(){
        return newsPaper;
    }

}
