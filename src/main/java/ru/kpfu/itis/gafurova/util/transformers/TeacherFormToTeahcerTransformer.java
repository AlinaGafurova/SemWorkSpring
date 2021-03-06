package ru.kpfu.itis.gafurova.util.transformers;

import ru.kpfu.itis.gafurova.model.Teacher;
import ru.kpfu.itis.gafurova.util.forms.TeacherForm;

import java.util.function.Function;

public class TeacherFormToTeahcerTransformer implements Function<TeacherForm, Teacher> {

    @Override
    public Teacher apply(TeacherForm teacherForm) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherForm.getFirstName());
        teacher.setLastName(teacherForm.getLastName());
        teacher.setAge(teacherForm.getAge());
        teacher.setSeniority(teacherForm.getSeniority());
        teacher.setRegalia(teacherForm.getRegalia());
        teacher.setPhoneNumber(teacherForm.getPhone());
        return teacher;
    }
}
