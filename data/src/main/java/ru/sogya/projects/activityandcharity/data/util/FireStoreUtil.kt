package ru.sogya.projects.activityandcharity.data.util

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.snapshots
import ru.sogya.projects.activityandcharity.data.model.FireStoreParam
import javax.inject.Inject

class FireStoreUtil @Inject constructor(private val fireStore: FirebaseFirestore) {

    fun getCollection(collectionName: String) = fireStore.collection(collectionName)

    fun getByParam(collectionName: String) =
        fireStore.collection(collectionName).snapshots()

    fun store(collectionName: String, data: HashMap<String, Any>) =
        fireStore.collection(collectionName).add(data)

    fun storeObjectWithDocument(collectionName: String, document: String, data: Any) =
        fireStore.collection(collectionName).document(document).set(data)

    fun delete(collectionName: String) {}
}