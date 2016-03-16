package com.frozan.model.timetable;

public class DailyTimeTable {

		private String classId;
		private String dayId;
		private String subject;
		private String startTime;
		private String endTime;
		private String teacher;
		private String dailyTimeTableId;
		
		public String getDailyTimeTableId() {
			return dailyTimeTableId;
		}
		public void setDailyTimeTableId(String dailyTimeTableId) {
			this.dailyTimeTableId = dailyTimeTableId;
		}
		public String getClassId() {
			return classId;
		}
		public void setClassId(String classId) {
			this.classId = classId;
		}
		
		public String getDayId() {
			return dayId;
		}
		public void setDayId(String dayId) {
			this.dayId = dayId;
		}
		
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		
		public String getEndTime() {
			return endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getTeacher() {
			return teacher;
		}
		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}
		@Override
		public String toString() {
			return "DailyTimeTable [classId=" + classId + ", dayId=" + dayId
					+ ", subject=" + subject + ", startTime=" + startTime
					+ ", endTime=" + endTime + ", teacher=" + teacher
					+ ", dailyTimeTableId=" + dailyTimeTableId + "]";
		}
		

	

}
