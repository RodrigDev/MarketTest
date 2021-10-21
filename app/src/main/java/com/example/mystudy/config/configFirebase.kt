package com.example.mystudy.config

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class configFirebase : AppCompatActivity() {
    companion object {
        private lateinit var auth: FirebaseAuth
        private lateinit var firebaseDatabase: DatabaseReference
        private lateinit var referenceStorage: StorageReference

        //Retorna o id do Usuário
        fun getIdUser(): String? {
            val authentication: FirebaseAuth = getFirebaseAuth();
            return authentication.currentUser?.uid
        }

        //Retorna a instancia do Firebase Auth
        fun getFirebaseAuth(): FirebaseAuth {
            if (auth == null) {
                auth = FirebaseAuth.getInstance()
            }
            return auth
        }

        //Retorna a referencia do Firebase Database
        fun getFirebaseDatabase(): DatabaseReference {
            if (firebaseDatabase == null) {
                firebaseDatabase = FirebaseDatabase.getInstance().reference
            }
            return firebaseDatabase
        }

        //Retorna a referencia do Storage
        fun getFirebaseStorage(): StorageReference {
            if (referenceStorage == null) {
                referenceStorage = FirebaseStorage.getInstance().reference
            }
            return referenceStorage
        }
    }
}