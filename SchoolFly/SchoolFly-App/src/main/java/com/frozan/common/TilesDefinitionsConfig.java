package com.frozan.common;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;

public final class TilesDefinitionsConfig implements DefinitionsFactory{
	private static final Map<String, Definition> tilesDefinitions = new HashMap<String,Definition>();
	 private static final Attribute BASE_TEMPLATE = new Attribute("/WEB-INF/views/layouts/layout.jsp");
	 private static final Attribute BASE_TEMPLATE_ADMIN = new Attribute("/WEB-INF/views/layouts/adminLogin.jsp");
	 private static final Attribute BASE_TEMPLATE_ADMIN_HOME = new Attribute("/WEB-INF/views/layouts/adminHome.jsp");

	 public Definition getDefinition(String name, Request tilesContext) {
	  return tilesDefinitions.get(name);
	 }
	 
	 private static void addDefaultLayoutDef(String name, String title, String body) {
		  Map<String, Attribute> attributes = new HashMap<String,Attribute>();

		  attributes.put("title", new Attribute(title));
		  attributes.put("header", new Attribute("/WEB-INF/views/firstheader.jsp"));
		  //attributes.put("menu", new Attribute("/WEB-INF/views/layout/menu.jsp"));
		  attributes.put("body", new Attribute(body));
		  attributes.put("footer", new Attribute("/WEB-INF/views/firstfooter.jsp"));

		  tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE, attributes));
		 }
	 private static void addParentLayoutDef(String name, String title, String body) {
		  Map<String, Attribute> attributes = new HashMap<String,Attribute>();

		  attributes.put("title", new Attribute(title));
		  attributes.put("header", new Attribute("/WEB-INF/views/parent/parentHeader.jsp"));
		  //attributes.put("menu", new Attribute("/WEB-INF/views/layout/menu.jsp"));
		  attributes.put("body", new Attribute(body));
		  attributes.put("footer", new Attribute("/WEB-INF/views/parent/secondfooter.jsp"));

		  tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE, attributes));
		 }
	 
	 private static void addAdminLayoutDef(String name, String title, String body) {
		  Map<String, Attribute> attributes = new HashMap<String,Attribute>();

		  attributes.put("title", new Attribute(title));
		  //attributes.put("header", new Attribute("/WEB-INF/views/parent/parentHeader.jsp"));
		  //attributes.put("menu", new Attribute("/WEB-INF/views/layout/menu.jsp"));
		  attributes.put("body", new Attribute(body));
		 // attributes.put("footer", new Attribute("/WEB-INF/views/parent/secondfooter.jsp"));

		  tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE_ADMIN, attributes));
		 }
	 
	 private static void addAdminHomeLayoutDef(String name, String title, String body) {
		  Map<String, Attribute> attributes = new HashMap<String,Attribute>();

		  attributes.put("title", new Attribute(title));
		  attributes.put("header", new Attribute("/WEB-INF/views/parent/parentHeader.jsp"));
		  //attributes.put("menu", new Attribute("/WEB-INF/views/layout/menu.jsp"));
		  attributes.put("body", new Attribute(body));
		 // attributes.put("footer", new Attribute("/WEB-INF/views/parent/secondfooter.jsp"));

		  tilesDefinitions.put(name, new Definition(name, BASE_TEMPLATE_ADMIN_HOME, attributes));
		 }
	 
	 
	 public static void addDefinitions(){
		  addDefaultLayoutDef("homepage", "Home", "/WEB-INF/views/firstbody.jsp");
		  addParentLayoutDef("parentpage", "Parent", "/WEB-INF/views/parent/parentBody.jsp");
		  addParentLayoutDef("teacherpage", "Teacher", "/WEB-INF/views/teacher/teacherBody.jsp");
		  addParentLayoutDef("studentpage", "Student", "/WEB-INF/views/student/studentBody.jsp");
		  addAdminLayoutDef("adminlogin", "Admin", "/WEB-INF/views/layouts/adminLogin.jsp");
		  addAdminHomeLayoutDef("adminhome", "AdminHome", "/WEB-INF/views/layouts/adminHome.jsp");
		 }

}
