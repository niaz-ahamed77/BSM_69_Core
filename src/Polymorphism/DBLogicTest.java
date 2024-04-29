package Polymorphism;

public class DBLogicTest {
    public static void main(String[] args) {
        DBLogic mysql = new MYSQLDB();
        DBLogic mongo = new MongoDBImpl();
        mysql.save();
        mysql.update();
        mysql.delete();
        mysql.find();
        //mysql.test(); // we get an error here because test isn't overridden 
        mongo.save();
        mongo.update();
        mongo.delete();
        mongo.find();
    }
}
