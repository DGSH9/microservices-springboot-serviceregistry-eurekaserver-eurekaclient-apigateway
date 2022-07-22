package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L,"dgsh@gmail.com","Durgesh",1311L),
            new Contact(2L,"neeraj@gmail.com","Neeraj",1311L),
            new Contact(3L,"ankit@gmail.com","Ankit",1312L),
            new Contact(4L,"mukesh@gmail.com","Mukesh",1313L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
