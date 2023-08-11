// activity_contacts_record_page.xml

package com.example.sisterslabhaftalikodevler.hafta4.odev1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabhaftalikodevler.databinding.ActivityContactsRecordPageBinding
import com.google.android.material.snackbar.Snackbar


class ContactsRecordPage : AppCompatActivity() {
    private lateinit var binding: ActivityContactsRecordPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsRecordPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name  = binding.Name.editText
        val phone= binding.phoneNumber.editText

        binding.button.setOnClickListener {
            if (name?.text.isNullOrEmpty() || phone?.text.isNullOrEmpty() ) {
                Snackbar.make(it, "Boş alanları doldurun", Snackbar.LENGTH_SHORT).show()
            }else {
                val recordIntent = Intent(this@ContactsRecordPage, ContactsResultPage::class.java)
                startActivity(recordIntent)
            }
        }
        }

    }
