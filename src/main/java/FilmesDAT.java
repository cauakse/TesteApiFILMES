import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmesDAT {

    public String Tittle;
    public String Year;
    public String Rated;
    public String Release;
    public String Runtime;
    public String Genre;
    public String Director;
    public String Writer;
    public String Actors;
    public String Plot;

    public String getTittle() {
        return Tittle;
    }

    public void setTittle(String tittle) {
        tittle=tittle.replaceAll("\\+"," ");
        Tittle = tittle;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String rated) {
        Rated = rated;
    }

    public String getRelease() {
        return Release;
    }

    public void setRelease(String release) {
        Release = release;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }
    public boolean verificaVazio()
    {
        if(this.Actors==null&&this.Director==null&&this.Genre==null&&this.Plot==null&&this.Rated==null&&this.Release==null&&this.Runtime==null
        &&this.Writer==null&&this.Year==null)
        {
            this.setTittle("Invalid movie or key!");
            return false;
        }
        else
        return true;
    }
    public String getALL()
    {
        String aux ="";
        aux+=getTittle()+"\n";
        aux+=getActors() +"\n";
        aux+=getDirector()+"\n";
        aux+=getGenre()+"\n";
        aux+=getRated()+"\n";
        if(this.Release!=null)
        aux+=getRelease()+"\n";

        aux+=getRuntime()+"\n";
        aux+=getWriter()+"\n";
        aux+=getYear()+"\n";
        aux+=getPlot()+"\n";

        return aux;
    }

}
