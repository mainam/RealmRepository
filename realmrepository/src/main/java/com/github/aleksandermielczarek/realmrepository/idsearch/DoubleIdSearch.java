package com.github.aleksandermielczarek.realmrepository.idsearch;

import io.realm.RealmObject;
import io.realm.RealmQuery;

/**
 * Created by Aleksander Mielczarek on 24.09.2016.
 */
public class DoubleIdSearch implements IdSearch {

    @Override
    public <T extends RealmObject> RealmQuery<T> searchId(RealmQuery<T> query, String idFieldName, Object id) {
        return query.equalTo(idFieldName, (Double) id);
    }
}
