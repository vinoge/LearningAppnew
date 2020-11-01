package com.example.learningapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME ="lessondata.db";
    private static final int DATABASE_VERSION = 1;
    SQLiteDatabase db;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table lesson(id integer primary key autoincrement,lesson text,type text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists lesson");
    }

    public boolean insert(String lesson,String type){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("lesson", lesson);
        contentValues.put("type", type);
        long ins = db.insert("lesson", null, contentValues);
        if (ins == -1) return false;
        else return true;
    }

    public List<word> getAllPlants(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='plant'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAnimals(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='animal'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllFactors(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='fact'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllProducts(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='pro'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllImportance(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='import'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllDigestion(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='diges'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllRespiration(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='respi'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllExcretion(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='excre'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCirculation(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='circu'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCoordination(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='coor'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllLevels(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='level'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllEcosystems(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='eco'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllPollution(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='poll'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllLifestyle(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='life'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
    public List<word> getAllDevelopment(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='devel'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllTypes(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mix'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSeparation(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='sep'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAcids(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='acid'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllBases(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='base'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSalts(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='salt'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllElectrochemicalcells(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cell'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllElectrolysis(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ele'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllEthen(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ethen'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllPolymer(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='poly'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMechanical(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mech'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllSounds(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='sou'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllInstruments(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='inst'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllReflection(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='ref'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMirrors(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mirr'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllRefraction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='refra'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllLenses(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='len'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllTemperature(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='tem'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllHeat(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='heat'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMatter(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mat'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllAppliences(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='app'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCircuits(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cir'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllIntroduction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='intro'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllJunctions(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='jun'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllCurrents(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='cur'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMagnetism(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='mag'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllMagneticeffects(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='effect'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }

    public List<word> getAllInduction(){
        List<word> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM lesson where type ='induc'",null);
        if(c.moveToFirst()){
            do{
                word question = new word();
                question.setName(c.getString(1));
                questionList.add(question);
            } while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
}



