package ru.sogya.projects.activityandcharity.repository.firebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository

class AuthRepositoryImpl:AuthRepository {
    private var firebaseAuth:FirebaseAuth? = null

    init {
        firebaseAuth = Firebase.auth
    }
    override fun login(login: String, password: String) {
        firebaseAuth?.signInWithCredential()
    }

    override fun registration(name: String, email: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun resetPassword(email: String) {
        TODO("Not yet implemented")
    }
}