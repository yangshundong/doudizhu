package files.util.db;

import files.domain.User;

public class dbtest {
    public static void main(String[] args) {
        Db1 db = new Db1();
        Object[] obj = {null, "zhnagshan1", "1234"};
        int i = db.update("insert into user values(?,?,?)", obj);

    }
}
