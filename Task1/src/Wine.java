import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String nameWine;
    private String labelWine;
    private String country;
    private LocalDate dateBottling;
    private String comment;

    public Wine() {
    }

    public Wine(String nameWine, String labelWine, String country, LocalDate dateBottling, String comment) {
        this.nameWine = nameWine;
        this.labelWine = labelWine;
        this.country = country;
        this.dateBottling = dateBottling;
        this.comment = comment;
    }

    public String getNameWine() {
        return nameWine;
    }

    public void setNameWine(String nameWine) {
        this.nameWine = nameWine;
    }

    public String getLabelWine() {
        return labelWine;
    }

    public void setLabelWine(String labelWine) {
        this.labelWine = labelWine;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateBottling() {
        return dateBottling;
    }

    public void setDateBottling(LocalDate dateBottling) {
        this.dateBottling = dateBottling;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public void agingWine(LocalDate dateNow) {
        int yearsAging = Period.between(dateBottling, dateNow).getYears();
        System.out.println("Выдержка вина составляет " + yearsAging + " лет");
    }
}
