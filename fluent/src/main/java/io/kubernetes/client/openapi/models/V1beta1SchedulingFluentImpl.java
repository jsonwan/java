package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public class V1beta1SchedulingFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<A> {

    private java.util.Map<java.lang.String,java.lang.String> nodeSelector;
    private java.util.List<io.kubernetes.client.openapi.models.V1TolerationBuilder> tolerations;

    public V1beta1SchedulingFluentImpl() {
    }

    public V1beta1SchedulingFluentImpl(io.kubernetes.client.openapi.models.V1beta1Scheduling instance) {
        this.withNodeSelector(instance.getNodeSelector());
        
        this.withTolerations(instance.getTolerations());
    }

    public A addToNodeSelector(java.lang.String key,java.lang.String value) {
        if(this.nodeSelector == null && key != null && value != null) { this.nodeSelector = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(); }
        if(key != null && value != null) {this.nodeSelector.put(key, value);} return (A)this;
    }

    public A addToNodeSelector(java.util.Map<java.lang.String,java.lang.String> map) {
        if(this.nodeSelector == null && map != null) { this.nodeSelector = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(); }
        if(map != null) { this.nodeSelector.putAll(map);} return (A)this;
    }

    public A removeFromNodeSelector(java.lang.String key) {
        if(this.nodeSelector == null) { return (A) this; }
        if(key != null && this.nodeSelector != null) {this.nodeSelector.remove(key);} return (A)this;
    }

    public A removeFromNodeSelector(java.util.Map<java.lang.String,java.lang.String> map) {
        if(this.nodeSelector == null) { return (A) this; }
        if(map != null) { for(Object key : map.keySet()) {if (this.nodeSelector != null){this.nodeSelector.remove(key);}}} return (A)this;
    }

    public java.util.Map<java.lang.String,java.lang.String> getNodeSelector() {
        return this.nodeSelector;
    }

    public <K,V>A withNodeSelector(java.util.Map<java.lang.String,java.lang.String> nodeSelector) {
        if (nodeSelector == null) { this.nodeSelector =  null;} else {this.nodeSelector = new java.util.LinkedHashMap<java.lang.String,java.lang.String>(nodeSelector);} return (A) this;
    }

    public java.lang.Boolean hasNodeSelector() {
        return this.nodeSelector != null;
    }

    public A addToTolerations(int index,io.kubernetes.client.openapi.models.V1Toleration item) {
        if (this.tolerations == null) {this.tolerations = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();}
        io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);_visitables.get("tolerations").add(index >= 0 ? index : _visitables.get("tolerations").size(), builder);this.tolerations.add(index >= 0 ? index : tolerations.size(), builder); return (A)this;
    }

    public A setToTolerations(int index,io.kubernetes.client.openapi.models.V1Toleration item) {
        if (this.tolerations == null) {this.tolerations = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();}
        io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);
        if (index < 0 || index >= _visitables.get("tolerations").size()) { _visitables.get("tolerations").add(builder); } else { _visitables.get("tolerations").set(index, builder);}
        if (index < 0 || index >= tolerations.size()) { tolerations.add(builder); } else { tolerations.set(index, builder);}
         return (A)this;
    }

    public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
        if (this.tolerations == null) {this.tolerations = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();}
        for (io.kubernetes.client.openapi.models.V1Toleration item : items) {io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
    }

    public A addAllToTolerations(java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items) {
        if (this.tolerations == null) {this.tolerations = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>();}
        for (io.kubernetes.client.openapi.models.V1Toleration item : items) {io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);_visitables.get("tolerations").add(builder);this.tolerations.add(builder);} return (A)this;
    }

    public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items) {
        for (io.kubernetes.client.openapi.models.V1Toleration item : items) {io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
    }

    public A removeAllFromTolerations(java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items) {
        for (io.kubernetes.client.openapi.models.V1Toleration item : items) {io.kubernetes.client.openapi.models.V1TolerationBuilder builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(item);_visitables.get("tolerations").remove(builder);if (this.tolerations != null) {this.tolerations.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromTolerations(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate) {
        if (tolerations == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1TolerationBuilder> each = tolerations.iterator();
        final List visitables = _visitables.get("tolerations");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1TolerationBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTolerations instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> getTolerations() {
        return build(tolerations);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> buildTolerations() {
        return build(tolerations);
    }

    public io.kubernetes.client.openapi.models.V1Toleration buildToleration(int index) {
        return this.tolerations.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1Toleration buildFirstToleration() {
        return this.tolerations.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1Toleration buildLastToleration() {
        return this.tolerations.get(tolerations.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1Toleration buildMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1TolerationBuilder item: tolerations) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1TolerationBuilder item: tolerations) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withTolerations(java.util.List<io.kubernetes.client.openapi.models.V1Toleration> tolerations) {
        if (this.tolerations != null) { _visitables.get("tolerations").removeAll(this.tolerations);}
        if (tolerations != null) {this.tolerations = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1TolerationBuilder>(); for (io.kubernetes.client.openapi.models.V1Toleration item : tolerations){this.addToTolerations(item);}} else { this.tolerations = null;} return (A) this;
    }

    public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations) {
        if (this.tolerations != null) {this.tolerations.clear();}
        if (tolerations != null) {for (io.kubernetes.client.openapi.models.V1Toleration item :tolerations){ this.addToTolerations(item);}} return (A) this;
    }

    public java.lang.Boolean hasTolerations() {
        return tolerations != null && !tolerations.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> addNewToleration() {
        return new io.kubernetes.client.openapi.models.V1beta1SchedulingFluentImpl.TolerationsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> addNewTolerationLike(io.kubernetes.client.openapi.models.V1Toleration item) {
        return new io.kubernetes.client.openapi.models.V1beta1SchedulingFluentImpl.TolerationsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> setNewTolerationLike(int index,io.kubernetes.client.openapi.models.V1Toleration item) {
        return new io.kubernetes.client.openapi.models.V1beta1SchedulingFluentImpl.TolerationsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> editToleration(int index) {
        if (tolerations.size() <= index) throw new RuntimeException("Can't edit tolerations. Index exceeds size.");
        return setNewTolerationLike(index, buildToleration(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> editFirstToleration() {
        if (tolerations.size() == 0) throw new RuntimeException("Can't edit first tolerations. The list is empty.");
        return setNewTolerationLike(0, buildToleration(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> editLastToleration() {
        int index = tolerations.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last tolerations. The list is empty.");
        return setNewTolerationLike(index, buildToleration(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<A> editMatchingToleration(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder> predicate) {
        int index = -1;
        for (int i=0;i<tolerations.size();i++) { 
        if (predicate.test(tolerations.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching tolerations. No match found.");
        return setNewTolerationLike(index, buildToleration(index));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1SchedulingFluentImpl that = (V1beta1SchedulingFluentImpl) o;
        if (nodeSelector != null ? !nodeSelector.equals(that.nodeSelector) :that.nodeSelector != null) return false;
        if (tolerations != null ? !tolerations.equals(that.tolerations) :that.tolerations != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(nodeSelector,  tolerations,  super.hashCode());
    }

    public class TolerationsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1TolerationFluentImpl<io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<N>> implements io.kubernetes.client.openapi.models.V1beta1SchedulingFluent.TolerationsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1TolerationBuilder builder;
        private final int index;

            TolerationsNestedImpl(int index,io.kubernetes.client.openapi.models.V1Toleration item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(this, item);
                        
            }

            TolerationsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1TolerationBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1SchedulingFluentImpl.this.setToTolerations(index,builder.build());
            }

            public N endToleration() {
                return and();
            }
    }


}
