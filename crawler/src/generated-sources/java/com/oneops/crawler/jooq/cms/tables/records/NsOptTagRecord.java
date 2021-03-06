/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.NsOptTag;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NsOptTagRecord extends UpdatableRecordImpl<NsOptTagRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1553975036;

    /**
     * Setter for <code>kloopzcm.ns_opt_tag.tag_id</code>.
     */
    public void setTagId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.ns_opt_tag.tag_id</code>.
     */
    public Long getTagId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.ns_opt_tag.tag</code>.
     */
    public void setTag(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.ns_opt_tag.tag</code>.
     */
    public String getTag() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return NsOptTag.NS_OPT_TAG.TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NsOptTag.NS_OPT_TAG.TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsOptTagRecord value1(Long value) {
        setTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsOptTagRecord value2(String value) {
        setTag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NsOptTagRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NsOptTagRecord
     */
    public NsOptTagRecord() {
        super(NsOptTag.NS_OPT_TAG);
    }

    /**
     * Create a detached, initialised NsOptTagRecord
     */
    public NsOptTagRecord(Long tagId, String tag) {
        super(NsOptTag.NS_OPT_TAG);

        set(0, tagId);
        set(1, tag);
    }
}
