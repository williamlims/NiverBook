package br.com.niverbook.model.repository

import br.com.niverbook.model.data.Contact
import br.com.niverbook.model.data.ContactDAO

class ContactRepository (private val contatoDAO: ContactDAO) {
    suspend fun insert(contact: Contact){
        contatoDAO.insert(contact)
    }

    suspend fun update(contact: Contact){
        contatoDAO.update(contact)
    }

    suspend fun delete(contact: Contact){
        contatoDAO.delete(contact)
    }
}