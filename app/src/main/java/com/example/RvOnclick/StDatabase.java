package com.example.RvOnclick;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Product.class,Customer.class,Order.class,OrderProduct.class},version = 2)
public abstract class StDatabase extends RoomDatabase {

    public abstract StDao stDao();




}
