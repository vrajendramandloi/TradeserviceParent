package com.util.uni.productsService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Products
{
	@Id
	private BigDecimal prod_id;
	private String prod_name;
	private String prod_desc;
	private String prod_subcategory;
	private BigDecimal prod_subcategory_id;
	private String prod_subcategory_desc;
	private String prod_category;
	private BigDecimal prod_category_id;
	private String prod_category_desc;
	private BigDecimal prod_weight_class;
	private String prod_unit_of_measure;
	private String prod_pack_size;
	private BigDecimal supplier_id;
	private String prod_status;
	private BigDecimal prod_list_price;
	private BigDecimal prod_min_price;
	private String prod_total;
	private BigDecimal prod_total_id;
	private BigDecimal prod_src_id;
	private java.sql.Date prod_eff_from;
	private java.sql.Date prod_eff_to;
	private String prod_valid;

	public BigDecimal getProd_id() {
		return prod_id;
	}

	public void setProd_id(BigDecimal prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public String getProd_subcategory() {
		return prod_subcategory;
	}

	public void setProd_subcategory(String prod_subcategory) {
		this.prod_subcategory = prod_subcategory;
	}

	public BigDecimal getProd_subcategory_id() {
		return prod_subcategory_id;
	}

	public void setProd_subcategory_id(BigDecimal prod_subcategory_id) {
		this.prod_subcategory_id = prod_subcategory_id;
	}

	public String getProd_subcategory_desc() {
		return prod_subcategory_desc;
	}

	public void setProd_subcategory_desc(String prod_subcategory_desc) {
		this.prod_subcategory_desc = prod_subcategory_desc;
	}

	public String getProd_category() {
		return prod_category;
	}

	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}

	public BigDecimal getProd_category_id() {
		return prod_category_id;
	}

	public void setProd_category_id(BigDecimal prod_category_id) {
		this.prod_category_id = prod_category_id;
	}

	public String getProd_category_desc() {
		return prod_category_desc;
	}

	public void setProd_category_desc(String prod_category_desc) {
		this.prod_category_desc = prod_category_desc;
	}

	public BigDecimal getProd_weight_class() {
		return prod_weight_class;
	}

	public void setProd_weight_class(BigDecimal prod_weight_class) {
		this.prod_weight_class = prod_weight_class;
	}

	public String getProd_unit_of_measure() {
		return prod_unit_of_measure;
	}

	public void setProd_unit_of_measure(String prod_unit_of_measure) {
		this.prod_unit_of_measure = prod_unit_of_measure;
	}

	public String getProd_pack_size() {
		return prod_pack_size;
	}

	public void setProd_pack_size(String prod_pack_size) {
		this.prod_pack_size = prod_pack_size;
	}

	public BigDecimal getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(BigDecimal supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getProd_status() {
		return prod_status;
	}

	public void setProd_status(String prod_status) {
		this.prod_status = prod_status;
	}

	public BigDecimal getProd_list_price() {
		return prod_list_price;
	}

	public void setProd_list_price(BigDecimal prod_list_price) {
		this.prod_list_price = prod_list_price;
	}

	public BigDecimal getProd_min_price() {
		return prod_min_price;
	}

	public void setProd_min_price(BigDecimal prod_min_price) {
		this.prod_min_price = prod_min_price;
	}

	public String getProd_total() {
		return prod_total;
	}

	public void setProd_total(String prod_total) {
		this.prod_total = prod_total;
	}

	public BigDecimal getProd_total_id() {
		return prod_total_id;
	}

	public void setProd_total_id(BigDecimal prod_total_id) {
		this.prod_total_id = prod_total_id;
	}

	public BigDecimal getProd_src_id() {
		return prod_src_id;
	}

	public void setProd_src_id(BigDecimal prod_src_id) {
		this.prod_src_id = prod_src_id;
	}

	public Date getProd_eff_from() {
		return prod_eff_from;
	}

	public void setProd_eff_from(Date prod_eff_from) {
		this.prod_eff_from = prod_eff_from;
	}

	public Date getProd_eff_to() {
		return prod_eff_to;
	}

	public void setProd_eff_to(Date prod_eff_to) {
		this.prod_eff_to = prod_eff_to;
	}

	public String getProd_valid() {
		return prod_valid;
	}

	public void setProd_valid(String prod_valid) {
		this.prod_valid = prod_valid;
	}
}