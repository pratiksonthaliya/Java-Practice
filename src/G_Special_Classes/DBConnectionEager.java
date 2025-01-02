package G_Special_Classes;

// 1st: Eager Initialization
public class DBConnectionEager {
    private static DBConnectionEager connectionObj = new DBConnectionEager();
    
    private DBConnectionEager(){}
    
    public static DBConnectionEager getInstance(){
        return connectionObj;
    }
}

// 2nd: Lazy Initialization
class DBConnectionLazy {
    private static DBConnectionLazy connectionObj = null;

    private DBConnectionLazy(){}

    public static DBConnectionLazy getInstance(){
        if(connectionObj == null){
            connectionObj = new DBConnectionLazy();
        }
        return connectionObj;
    }
}

// 3rd: Synchronized Method
class DBConnectionSynchronized {
    private static DBConnectionSynchronized connectionObj;

    private DBConnectionSynchronized(){}

    public static synchronized DBConnectionSynchronized getInstance(){
        if(connectionObj == null){
            connectionObj = new DBConnectionSynchronized();
        }
        return connectionObj;
    }
}

// 4th: Double-Checked Locking
class DBConnectionDoubleCheckedLocking {
    private static DBConnectionDoubleCheckedLocking connectionObj;

    private DBConnectionDoubleCheckedLocking(){}

    public static DBConnectionDoubleCheckedLocking getInstance(){
        if(connectionObj == null){
            synchronized (DBConnectionDoubleCheckedLocking.class) {
                if (connectionObj == null) {
                    connectionObj = new DBConnectionDoubleCheckedLocking();
                }
            }
        }
        return connectionObj;
    }
}

// 5th: Bill Pugh Solution
class DBConnectionBillPugh {

    private DBConnectionBillPugh(){}

    private static final class ConnectionObjHolder {
        private static final DBConnectionBillPugh connectionObj = new DBConnectionBillPugh();
    }

    public static DBConnectionBillPugh getInstance(){
        return ConnectionObjHolder.connectionObj;
    }
}

// 6th: ENUM Class
enum DBConnectionUsingEnum {
    INSTANCE;
}
