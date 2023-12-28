package ru.sogya.projects.activityandcharity.data.util

import com.google.firebase.auth.FirebaseAuth
import javax.inject.Inject

class FirebaseAuthenticator @Inject constructor(private val firebaseAuth: FirebaseAuth) {
    fun signUpWithEmailPassword(email: String, password: String) =
        firebaseAuth.createUserWithEmailAndPassword(email, password)

    fun signInWithEmailPassword(email: String, password: String) =
        firebaseAuth.signInWithEmailAndPassword(email, password)

    fun signOut() = firebaseAuth.signOut()

    fun sendPasswordReset(email: String) = firebaseAuth.sendPasswordResetEmail(email)
}