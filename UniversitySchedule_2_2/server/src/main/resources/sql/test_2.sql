INSERT INTO public.audience(id, description, name)
VALUES (1, 'test id 1 description', '112'),
       (2, 'qqqqqqqqq id 2', '324'),
       (3, '3333 id 3', '412');

INSERT INTO public.department(id, name)
VALUES (1, 'Компютерні науки'),
       (2, 'Кібербезпека'),
       (3, 'Екологія');

INSERT INTO public.institute(id, name)
VALUES (1, 'Цивільного захисту'),
       (2, 'Пожежної та техногенної безпеки'),
       (3, 'Психології та соціального захисту');

INSERT INTO public.lesson_type(id, abbreviated, name)
VALUES (1, '(Л)', 'Лекція'),
       (2, '(Пр)', 'Практичне'),
       (3, '(Сем)', 'Семінар'),
       (4, '(Зал)', 'Залік'),
       (5, '(Екз)', 'Екзамен');

INSERT INTO public.rank(id, name)
VALUES (1, 'Лейтенант'),
       (2, 'Майор'),
       (3, 'Капітан');

INSERT INTO public.specialty(id, name)
VALUES (1, 'Компютерні науки'),
       (2, 'Кібербеспека'),
       (3, 'Екологія');

INSERT INTO public.subject(id, name)
VALUES (1, 'Укр. мова'),
       (2, 'Дискретна математика'),
       (3, 'Java');

INSERT INTO public.teacher(id, about, address, first_name, last_name, middle_name, phone_number_1,
                           phone_number_2, department_id, rank_id)
VALUES (1, 'wwwwwwww222', 'вул. Шевченка 23', 'Оксана', 'Карабин', 'Олександрівна', '45485452',
        '786763453435', 3, 2),
       (2, 'ccccccc', 'вул. Виговського 221А', 'Олександр', 'Придатко', 'Володимирович',
        '854533541541', '', 1, 1),
       (3, '', 'вул. Бандери 2', 'Артур', 'Ренкас', 'Андрійович', '', '0001515', 2, 2);


INSERT INTO public.group_table(id, course, name, curator_id, department_id, institute_id,
                               specialty_id)
VALUES (1, 3, 'КН-31', 2, 1, 1, 1),
       (2, 2, 'КБ-21', 3, 2, 1, 2),
       (3, 1, 'ЕК-11', 1, 3, 2, 3);

INSERT INTO public.student(id, about, address, first_name, last_name, middle_name, phone_number_1,
                           phone_number_2, group_id)
VALUES (1, '', 'вул. Панаса Мирного 18Д', 'Віталій', 'Бойко', 'Батькович', '85634545', '', 1),
       (2, '!!***dcfgvsd', 'вул. Македонського 1', 'Василь', 'Савків', 'Захарович', '127545',
        '786846545', 1),
       (3, '', 'вул. Старознесеньська 561', 'Влад', 'Шевчук', 'Остапович', '', '', 2);


-- UPDATE public.group_table
-- SET captain_id=1
-- WHERE id = 1;
-- UPDATE public.group_table
-- SET captain_id=2
-- WHERE id = 2;
-- UPDATE public.group_table
-- SET captain_id=3
-- WHERE id = 3;


INSERT INTO public.timetable(id, lesson_date, number_of_lesson_in_day, audience_id, lesson_type_id,
                             subject_id, teacher_id)
VALUES (1, '2019-07-02 10:45:30.876', 1, 1, 1, 1, 1),
       (2, '2018-06-05 12:45:30.876', 2, 2, 2, 2, 2),
       (3, '2017-03-06 10:10:30.876', 3, 3, 3, 3, 3),
       (4, '2019-07-02 10:45:30.876', 1, 1, 1, 1, 1);

INSERT INTO public.timetable_group(group_id, timetable_id)
VALUES (1, 1),
       (1, 2),
       (2, 1),
       (2, 2);