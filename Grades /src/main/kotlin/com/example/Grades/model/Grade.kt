package com.example.Grades.model

import jakarta.persistence.*



@Entity
@Table(name = "grade")
class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "grade_name", nullable = false)
    var gradeName: String? = null

    @Column(name = "grade_value", nullable = false)
    var gradeValue: Double? = null

    @Column(name = "student_id")
    var studentId: Int? = null
}
