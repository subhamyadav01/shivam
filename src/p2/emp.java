package p2;

public class emp extends person {
    int eid;
    int sal;

    public emp(int age, String name, int eid, int sal) {
        super(age, name);
        this.eid = eid;
        this.sal = sal;
    }
}

