package com.example.Students.model

import jakarta.persistence.*


@Entity
@Table(name = "student")
class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
     var id: Long? = null

    @Column(name = "full_name", nullable = false)
     var fullName: String? = null

    @Column(name = "last_name", nullable = false)
     var lastName: String? = null

    @Column(name = "age", nullable = false, unique = true)
     var age: Int? = null
}

