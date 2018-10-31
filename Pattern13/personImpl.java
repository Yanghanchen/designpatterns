package Pattern13;

public class personImpl implements personBean {
    String name;
    String gender;
    String interest;
    int hot;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interest;
    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public int getHotRating() {
        return hot;
    }

    public personImpl(String name, String gender, String interest, int hot) {
        this.name = name;
        this.gender = gender;
        this.interest = interest;
        this.hot = hot;
    }

    @Override
    public void setHotRate(int hot) {
        this.hot = hot;
    }
}
